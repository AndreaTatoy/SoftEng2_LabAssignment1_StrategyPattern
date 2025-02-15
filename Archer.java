package LabAssignment1_StrategyPattern;
import java.util.List;

public class Archer extends Character{
        public Archer(){
            super(new ShootArrow(), List.of(new Dodge()));
        }
    }
