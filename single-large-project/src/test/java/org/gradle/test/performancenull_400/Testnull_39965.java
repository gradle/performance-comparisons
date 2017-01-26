package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39965 {
    private final Productionnull_39965 production = new Productionnull_39965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}