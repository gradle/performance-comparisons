package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46076 {
    private final Productionnull_46076 production = new Productionnull_46076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}