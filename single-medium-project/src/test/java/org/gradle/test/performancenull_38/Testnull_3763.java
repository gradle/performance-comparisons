package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3763 {
    private final Productionnull_3763 production = new Productionnull_3763("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}