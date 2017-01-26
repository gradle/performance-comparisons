package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42126 {
    private final Productionnull_42126 production = new Productionnull_42126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}