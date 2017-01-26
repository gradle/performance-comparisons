package org.gradle.test.performancenull_322;

import static org.junit.Assert.*;

public class Testnull_32186 {
    private final Productionnull_32186 production = new Productionnull_32186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}