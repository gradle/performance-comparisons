package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38573 {
    private final Productionnull_38573 production = new Productionnull_38573("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}