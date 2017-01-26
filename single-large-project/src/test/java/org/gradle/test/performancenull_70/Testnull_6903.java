package org.gradle.test.performancenull_70;

import static org.junit.Assert.*;

public class Testnull_6903 {
    private final Productionnull_6903 production = new Productionnull_6903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}