package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17995 {
    private final Productionnull_17995 production = new Productionnull_17995("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}