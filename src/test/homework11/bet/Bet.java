package test.homework11.bet;

import java.util.Scanner;

public class Bet {
    private double bid;
    private double risk;

    public Bet() {
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    public static void main(String[] args) {
        Bet bet = new Bet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ставку");
        bet.setBid(scanner.nextDouble());
        System.out.println("Введите риск");
        bet.setRisk(scanner.nextDouble());
        System.out.println("Ставка - " + bet.getBid() + "\nРиск - " + bet.getRisk());
        scanner.close();
    }
}
