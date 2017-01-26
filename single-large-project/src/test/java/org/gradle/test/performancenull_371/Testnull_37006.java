package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37006 {
    private final Productionnull_37006 production = new Productionnull_37006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}