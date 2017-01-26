package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34959 {
    private final Productionnull_34959 production = new Productionnull_34959("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}