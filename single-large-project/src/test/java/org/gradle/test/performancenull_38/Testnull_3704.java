package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3704 {
    private final Productionnull_3704 production = new Productionnull_3704("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}