package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37061 {
    private final Productionnull_37061 production = new Productionnull_37061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}