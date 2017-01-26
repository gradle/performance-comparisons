package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4762 {
    private final Productionnull_4762 production = new Productionnull_4762("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}