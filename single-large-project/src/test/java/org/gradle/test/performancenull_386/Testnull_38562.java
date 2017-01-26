package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38562 {
    private final Productionnull_38562 production = new Productionnull_38562("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}