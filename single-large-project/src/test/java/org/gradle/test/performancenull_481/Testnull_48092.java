package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48092 {
    private final Productionnull_48092 production = new Productionnull_48092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}