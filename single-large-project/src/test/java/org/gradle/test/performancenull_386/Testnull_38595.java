package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38595 {
    private final Productionnull_38595 production = new Productionnull_38595("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}