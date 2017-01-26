package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38546 {
    private final Productionnull_38546 production = new Productionnull_38546("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}