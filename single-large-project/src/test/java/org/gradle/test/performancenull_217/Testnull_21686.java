package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21686 {
    private final Productionnull_21686 production = new Productionnull_21686("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}