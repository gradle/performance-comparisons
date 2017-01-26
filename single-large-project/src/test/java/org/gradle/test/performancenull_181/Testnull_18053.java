package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18053 {
    private final Productionnull_18053 production = new Productionnull_18053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}