package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40182 {
    private final Productionnull_40182 production = new Productionnull_40182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}