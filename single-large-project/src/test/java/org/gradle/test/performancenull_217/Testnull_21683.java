package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21683 {
    private final Productionnull_21683 production = new Productionnull_21683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}