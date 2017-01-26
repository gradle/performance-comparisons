package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38577 {
    private final Productionnull_38577 production = new Productionnull_38577("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}