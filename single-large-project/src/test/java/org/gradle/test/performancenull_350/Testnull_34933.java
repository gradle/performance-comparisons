package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34933 {
    private final Productionnull_34933 production = new Productionnull_34933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}