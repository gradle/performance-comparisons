package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46078 {
    private final Productionnull_46078 production = new Productionnull_46078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}