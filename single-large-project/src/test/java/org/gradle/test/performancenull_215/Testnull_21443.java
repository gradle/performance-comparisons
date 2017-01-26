package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21443 {
    private final Productionnull_21443 production = new Productionnull_21443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}