package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31943 {
    private final Productionnull_31943 production = new Productionnull_31943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}