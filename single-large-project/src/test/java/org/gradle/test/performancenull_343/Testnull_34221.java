package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34221 {
    private final Productionnull_34221 production = new Productionnull_34221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}