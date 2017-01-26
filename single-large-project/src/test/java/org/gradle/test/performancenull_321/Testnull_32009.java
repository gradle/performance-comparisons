package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32009 {
    private final Productionnull_32009 production = new Productionnull_32009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}