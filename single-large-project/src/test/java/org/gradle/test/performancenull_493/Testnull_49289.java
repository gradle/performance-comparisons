package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49289 {
    private final Productionnull_49289 production = new Productionnull_49289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}