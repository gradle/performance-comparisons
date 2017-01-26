package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47983 {
    private final Productionnull_47983 production = new Productionnull_47983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}