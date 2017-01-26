package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37068 {
    private final Productionnull_37068 production = new Productionnull_37068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}