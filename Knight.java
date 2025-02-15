package LabAssignment1_StrategyPattern;
import java.util.List;

public class Knight extends Character{
    public Knight(){
        super(new SwingSword(), List.of(new Shield(), new Dodge(), new CreateMagic()));
    }
}
