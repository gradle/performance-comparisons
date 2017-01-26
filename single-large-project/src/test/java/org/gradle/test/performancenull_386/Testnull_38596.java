package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38596 {
    private final Productionnull_38596 production = new Productionnull_38596("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}