package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40121 {
    private final Productionnull_40121 production = new Productionnull_40121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}