package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34258 {
    private final Productionnull_34258 production = new Productionnull_34258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}