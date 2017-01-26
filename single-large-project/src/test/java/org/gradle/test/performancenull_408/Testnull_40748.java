package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40748 {
    private final Productionnull_40748 production = new Productionnull_40748("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}