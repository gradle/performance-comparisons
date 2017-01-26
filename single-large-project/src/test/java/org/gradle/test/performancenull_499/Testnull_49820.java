package org.gradle.test.performancenull_499;

import static org.junit.Assert.*;

public class Testnull_49820 {
    private final Productionnull_49820 production = new Productionnull_49820("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}