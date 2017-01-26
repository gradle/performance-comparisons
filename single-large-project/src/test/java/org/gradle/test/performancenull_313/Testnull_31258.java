package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31258 {
    private final Productionnull_31258 production = new Productionnull_31258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}