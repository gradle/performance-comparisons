package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19906 {
    private final Productionnull_19906 production = new Productionnull_19906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}