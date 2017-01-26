package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21690 {
    private final Productionnull_21690 production = new Productionnull_21690("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}