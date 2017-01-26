package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34911 {
    private final Productionnull_34911 production = new Productionnull_34911("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}