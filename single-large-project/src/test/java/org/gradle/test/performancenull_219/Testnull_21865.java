package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21865 {
    private final Productionnull_21865 production = new Productionnull_21865("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}