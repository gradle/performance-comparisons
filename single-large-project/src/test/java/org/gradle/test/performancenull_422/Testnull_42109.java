package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42109 {
    private final Productionnull_42109 production = new Productionnull_42109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}