package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46084 {
    private final Productionnull_46084 production = new Productionnull_46084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}