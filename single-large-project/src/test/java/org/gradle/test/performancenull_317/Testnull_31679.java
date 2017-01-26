package org.gradle.test.performancenull_317;

import static org.junit.Assert.*;

public class Testnull_31679 {
    private final Productionnull_31679 production = new Productionnull_31679("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}