package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36199 {
    private final Productionnull_36199 production = new Productionnull_36199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}