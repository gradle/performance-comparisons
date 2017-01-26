package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19903 {
    private final Productionnull_19903 production = new Productionnull_19903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}