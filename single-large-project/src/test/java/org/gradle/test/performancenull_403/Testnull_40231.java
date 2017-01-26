package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40231 {
    private final Productionnull_40231 production = new Productionnull_40231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}