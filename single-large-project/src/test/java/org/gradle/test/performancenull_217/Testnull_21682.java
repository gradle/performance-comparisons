package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21682 {
    private final Productionnull_21682 production = new Productionnull_21682("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}