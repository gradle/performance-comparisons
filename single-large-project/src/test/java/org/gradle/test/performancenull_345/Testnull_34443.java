package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34443 {
    private final Productionnull_34443 production = new Productionnull_34443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}