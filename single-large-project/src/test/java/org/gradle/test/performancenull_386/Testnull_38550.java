package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38550 {
    private final Productionnull_38550 production = new Productionnull_38550("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}