package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9449 {
    private final Productionnull_9449 production = new Productionnull_9449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}