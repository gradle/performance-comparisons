package org.gradle.test.performancenull_105;

import static org.junit.Assert.*;

public class Testnull_10468 {
    private final Productionnull_10468 production = new Productionnull_10468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}