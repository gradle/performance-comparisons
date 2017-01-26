package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34290 {
    private final Productionnull_34290 production = new Productionnull_34290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}