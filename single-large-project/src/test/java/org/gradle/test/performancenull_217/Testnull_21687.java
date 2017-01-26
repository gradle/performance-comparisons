package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21687 {
    private final Productionnull_21687 production = new Productionnull_21687("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}