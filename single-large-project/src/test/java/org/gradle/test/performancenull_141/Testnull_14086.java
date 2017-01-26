package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14086 {
    private final Productionnull_14086 production = new Productionnull_14086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}