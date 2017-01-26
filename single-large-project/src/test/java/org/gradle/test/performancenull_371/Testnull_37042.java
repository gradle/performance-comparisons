package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37042 {
    private final Productionnull_37042 production = new Productionnull_37042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}