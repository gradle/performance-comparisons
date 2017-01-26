package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37026 {
    private final Productionnull_37026 production = new Productionnull_37026("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}