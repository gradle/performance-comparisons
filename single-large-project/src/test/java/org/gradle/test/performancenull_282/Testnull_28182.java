package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28182 {
    private final Productionnull_28182 production = new Productionnull_28182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}