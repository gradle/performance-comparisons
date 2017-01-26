package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21665 {
    private final Productionnull_21665 production = new Productionnull_21665("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}