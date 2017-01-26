package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34250 {
    private final Productionnull_34250 production = new Productionnull_34250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}