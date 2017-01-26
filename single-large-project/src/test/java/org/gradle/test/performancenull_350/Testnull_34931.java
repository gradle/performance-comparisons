package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34931 {
    private final Productionnull_34931 production = new Productionnull_34931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}