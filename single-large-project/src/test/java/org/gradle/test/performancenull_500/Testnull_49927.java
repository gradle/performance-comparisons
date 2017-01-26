package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49927 {
    private final Productionnull_49927 production = new Productionnull_49927("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}