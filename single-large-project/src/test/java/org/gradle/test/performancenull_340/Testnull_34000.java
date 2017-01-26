package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_34000 {
    private final Productionnull_34000 production = new Productionnull_34000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}