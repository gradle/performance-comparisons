package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37076 {
    private final Productionnull_37076 production = new Productionnull_37076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}