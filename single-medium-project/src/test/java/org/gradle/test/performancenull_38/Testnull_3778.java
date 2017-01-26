package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3778 {
    private final Productionnull_3778 production = new Productionnull_3778("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}