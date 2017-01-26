package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20182 {
    private final Productionnull_20182 production = new Productionnull_20182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}