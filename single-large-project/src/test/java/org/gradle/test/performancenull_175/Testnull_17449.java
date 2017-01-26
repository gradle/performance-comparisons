package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17449 {
    private final Productionnull_17449 production = new Productionnull_17449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}