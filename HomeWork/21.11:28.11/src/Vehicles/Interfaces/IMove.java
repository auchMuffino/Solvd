package Vehicles.Interfaces;

import Excemptions.BrokenExemption;
import Excemptions.CarExcemption;

public interface IMove {
    void go(int kms) throws CarExcemption;

    default void startEngine(){
        System.out.println("Engine started");
    }
}
