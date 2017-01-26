package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38545 {
    private final Productionnull_38545 production = new Productionnull_38545("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}