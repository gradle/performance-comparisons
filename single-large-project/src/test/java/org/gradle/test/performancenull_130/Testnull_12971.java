package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12971 {
    private final Productionnull_12971 production = new Productionnull_12971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}