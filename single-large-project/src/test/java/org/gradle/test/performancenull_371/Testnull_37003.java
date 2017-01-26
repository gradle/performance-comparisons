package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37003 {
    private final Productionnull_37003 production = new Productionnull_37003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}