package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8468 {
    private final Productionnull_8468 production = new Productionnull_8468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}