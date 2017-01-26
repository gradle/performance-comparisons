package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38553 {
    private final Productionnull_38553 production = new Productionnull_38553("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}