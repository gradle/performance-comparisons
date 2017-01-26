package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3497 {
    private final Productionnull_3497 production = new Productionnull_3497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}