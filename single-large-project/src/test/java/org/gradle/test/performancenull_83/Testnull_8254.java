package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8254 {
    private final Productionnull_8254 production = new Productionnull_8254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}