package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18094 {
    private final Productionnull_18094 production = new Productionnull_18094("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}