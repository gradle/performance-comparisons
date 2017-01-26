package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37002 {
    private final Productionnull_37002 production = new Productionnull_37002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}