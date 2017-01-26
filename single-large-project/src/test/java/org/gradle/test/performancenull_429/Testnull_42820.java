package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42820 {
    private final Productionnull_42820 production = new Productionnull_42820("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}