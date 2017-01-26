package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29962 {
    private final Productionnull_29962 production = new Productionnull_29962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}