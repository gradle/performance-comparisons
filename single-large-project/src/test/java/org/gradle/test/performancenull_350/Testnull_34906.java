package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34906 {
    private final Productionnull_34906 production = new Productionnull_34906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}