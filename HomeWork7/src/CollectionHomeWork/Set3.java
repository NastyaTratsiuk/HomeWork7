package CollectionHomeWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set3<T extends CreditCard> {

    static final int maxCargo = 75;
    static int sumCargo = 0;
    static int difference = 0;

    public static void comparisonCargo() {
        Set<Integer> cargo = new TreeSet<>();
        cargo.add(23);
        cargo.add(13);
        cargo.add(18);
        cargo.add(20);
        cargo.add(5);

        for (int cargoW : cargo) {
            sumCargo += cargoW;
        }
        System.out.println("S" + sumCargo);

        if (sumCargo > maxCargo) {
            difference = sumCargo - maxCargo;

            Iterator<Integer> cargoIterator = cargo.iterator();
            while (cargoIterator.hasNext()) {
                if (cargoIterator.next() >= difference) {
                    sumCargo -= cargoIterator.next();
                    cargoIterator.remove();
                    break;
                }
            }
        }
        System.out.println(sumCargo);
        System.out.println(cargo);
    }

    public static void creditCardCollection() {
        Set<CreditCard> creditCards = new HashSet<>();
        creditCards.add(new CreditCard("BNB", "Nastya ", 12346));
        creditCards.add(new CreditCard("Belgazprombank", "Dima", 23456));
        creditCards.add(new CreditCard("Belarusbank", "Vlad", 65431));

        for (CreditCard card : creditCards) {
            System.out.println(card.getBank() + " " + card.getName() + " " + card.getNumber());
        }
    }
}

