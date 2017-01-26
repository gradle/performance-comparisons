package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47968 {
    private final Productionnull_47968 production = new Productionnull_47968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}