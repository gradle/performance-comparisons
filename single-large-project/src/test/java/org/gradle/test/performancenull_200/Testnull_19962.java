package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19962 {
    private final Productionnull_19962 production = new Productionnull_19962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}