package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18049 {
    private final Productionnull_18049 production = new Productionnull_18049("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}