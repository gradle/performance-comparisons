package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21183 {
    private final Productionnull_21183 production = new Productionnull_21183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}