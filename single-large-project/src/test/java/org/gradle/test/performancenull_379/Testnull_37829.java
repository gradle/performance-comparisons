package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37829 {
    private final Productionnull_37829 production = new Productionnull_37829("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}