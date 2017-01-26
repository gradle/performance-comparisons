package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34205 {
    private final Productionnull_34205 production = new Productionnull_34205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}