package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21862 {
    private final Productionnull_21862 production = new Productionnull_21862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}