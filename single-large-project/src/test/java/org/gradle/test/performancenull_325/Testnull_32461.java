package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32461 {
    private final Productionnull_32461 production = new Productionnull_32461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}