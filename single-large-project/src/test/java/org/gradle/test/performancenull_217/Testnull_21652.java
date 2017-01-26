package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21652 {
    private final Productionnull_21652 production = new Productionnull_21652("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}