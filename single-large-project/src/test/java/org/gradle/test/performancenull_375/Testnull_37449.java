package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37449 {
    private final Productionnull_37449 production = new Productionnull_37449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}