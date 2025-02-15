package LabAssignment1_StrategyPattern;

public class ShootArrow implements AttackStrategy{
    public void attack(){
        System.out.println("Archer shoots an arrow!");
    }
}
