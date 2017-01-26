package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23781 {
    private final Productionnull_23781 production = new Productionnull_23781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}