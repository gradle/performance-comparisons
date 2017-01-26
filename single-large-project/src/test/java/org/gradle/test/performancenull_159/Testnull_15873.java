package org.gradle.test.performancenull_159;

import static org.junit.Assert.*;

public class Testnull_15873 {
    private final Productionnull_15873 production = new Productionnull_15873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}