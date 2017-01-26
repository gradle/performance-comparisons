package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34969 {
    private final Productionnull_34969 production = new Productionnull_34969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}