package com.cartoonishvillain.vdm.Capabilities.EntityCapabilities;

public interface IEntityCapability {
    boolean getRetaliationStatus();
    void setRetaliationStatus(boolean set);
    int getAge();
    void setAge(int age);
    boolean getWrongStatus();
    void setWrongStatus(boolean set);
}
