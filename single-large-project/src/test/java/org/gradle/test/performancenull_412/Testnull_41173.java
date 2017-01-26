package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41173 {
    private final Productionnull_41173 production = new Productionnull_41173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}