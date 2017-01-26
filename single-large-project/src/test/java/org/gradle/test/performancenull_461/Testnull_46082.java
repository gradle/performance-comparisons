package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46082 {
    private final Productionnull_46082 production = new Productionnull_46082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}