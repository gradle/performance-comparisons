package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37804 {
    private final Productionnull_37804 production = new Productionnull_37804("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}