package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25820 {
    private final Productionnull_25820 production = new Productionnull_25820("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}