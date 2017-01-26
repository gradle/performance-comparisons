package org.gradle.test.performancenull_347;

import static org.junit.Assert.*;

public class Testnull_34606 {
    private final Productionnull_34606 production = new Productionnull_34606("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}