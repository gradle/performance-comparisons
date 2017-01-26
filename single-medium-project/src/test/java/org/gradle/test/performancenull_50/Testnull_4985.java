package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4985 {
    private final Productionnull_4985 production = new Productionnull_4985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}