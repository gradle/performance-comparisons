package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34978 {
    private final Productionnull_34978 production = new Productionnull_34978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}