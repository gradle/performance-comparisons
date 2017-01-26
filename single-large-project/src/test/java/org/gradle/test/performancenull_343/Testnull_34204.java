package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34204 {
    private final Productionnull_34204 production = new Productionnull_34204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}