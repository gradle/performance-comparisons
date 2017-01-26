package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38585 {
    private final Productionnull_38585 production = new Productionnull_38585("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}