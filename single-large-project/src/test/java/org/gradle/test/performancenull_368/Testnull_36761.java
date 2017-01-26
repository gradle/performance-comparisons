package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36761 {
    private final Productionnull_36761 production = new Productionnull_36761("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}