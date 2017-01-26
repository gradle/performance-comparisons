package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37845 {
    private final Productionnull_37845 production = new Productionnull_37845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}