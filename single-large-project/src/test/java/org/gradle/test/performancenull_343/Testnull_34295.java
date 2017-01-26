package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34295 {
    private final Productionnull_34295 production = new Productionnull_34295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}