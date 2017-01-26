package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39955 {
    private final Productionnull_39955 production = new Productionnull_39955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}