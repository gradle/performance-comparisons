package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19156 {
    private final Productionnull_19156 production = new Productionnull_19156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}