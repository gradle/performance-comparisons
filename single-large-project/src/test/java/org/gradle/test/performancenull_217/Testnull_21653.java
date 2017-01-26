package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21653 {
    private final Productionnull_21653 production = new Productionnull_21653("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}