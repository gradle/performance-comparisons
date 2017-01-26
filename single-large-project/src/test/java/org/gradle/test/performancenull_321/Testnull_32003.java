package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32003 {
    private final Productionnull_32003 production = new Productionnull_32003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}