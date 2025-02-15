package LabAssignment1_StrategyPattern;
import java.util.ArrayList;
import java.util.List;

abstract class Character {
    protected AttackStrategy attackStrategy;
    protected List<DefenseStrategy> defenseStrategies = new ArrayList<>();

    public Character(AttackStrategy attackStrategy, List<DefenseStrategy> defenseStrategies) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategies.addAll(defenseStrategies);
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefend() {
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void addDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategies.add(defenseStrategy);
    }
}