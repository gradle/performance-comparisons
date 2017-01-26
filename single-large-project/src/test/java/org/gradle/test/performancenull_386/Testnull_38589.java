package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38589 {
    private final Productionnull_38589 production = new Productionnull_38589("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}