package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25541 {
    private final Productionnull_25541 production = new Productionnull_25541("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}