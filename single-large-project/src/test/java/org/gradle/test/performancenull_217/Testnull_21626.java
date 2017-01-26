package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21626 {
    private final Productionnull_21626 production = new Productionnull_21626("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}