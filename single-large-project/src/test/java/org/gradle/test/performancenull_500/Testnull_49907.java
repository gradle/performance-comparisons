package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49907 {
    private final Productionnull_49907 production = new Productionnull_49907("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}