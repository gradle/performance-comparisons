package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38537 {
    private final Productionnull_38537 production = new Productionnull_38537("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}