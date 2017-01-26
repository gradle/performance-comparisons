package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4752 {
    private final Productionnull_4752 production = new Productionnull_4752("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}