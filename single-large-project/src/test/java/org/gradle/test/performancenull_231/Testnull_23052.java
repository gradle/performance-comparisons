package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23052 {
    private final Productionnull_23052 production = new Productionnull_23052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}