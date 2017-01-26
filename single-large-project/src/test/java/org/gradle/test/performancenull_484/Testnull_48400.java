package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48400 {
    private final Productionnull_48400 production = new Productionnull_48400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}