package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38576 {
    private final Productionnull_38576 production = new Productionnull_38576("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}