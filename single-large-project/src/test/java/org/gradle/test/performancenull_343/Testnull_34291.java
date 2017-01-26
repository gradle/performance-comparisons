package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34291 {
    private final Productionnull_34291 production = new Productionnull_34291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}