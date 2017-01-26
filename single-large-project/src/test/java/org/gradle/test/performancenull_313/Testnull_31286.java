package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31286 {
    private final Productionnull_31286 production = new Productionnull_31286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}