package LabAssignment1_StrategyPattern;
import java.util.List;

public class Wizard extends Character{
    public Wizard(){
        super(new CastSpell(), List.of(new CreateMagic()));
    }
}
