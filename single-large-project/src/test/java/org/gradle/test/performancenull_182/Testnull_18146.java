package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18146 {
    private final Productionnull_18146 production = new Productionnull_18146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}