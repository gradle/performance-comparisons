package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33048 {
    private final Productionnull_33048 production = new Productionnull_33048("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}