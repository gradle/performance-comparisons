package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38543 {
    private final Productionnull_38543 production = new Productionnull_38543("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}