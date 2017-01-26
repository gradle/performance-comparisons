package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20449 {
    private final Productionnull_20449 production = new Productionnull_20449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}