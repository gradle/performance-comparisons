package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11929 {
    private final Productionnull_11929 production = new Productionnull_11929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}