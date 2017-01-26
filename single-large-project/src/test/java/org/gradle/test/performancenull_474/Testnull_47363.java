package org.gradle.test.performancenull_474;

import static org.junit.Assert.*;

public class Testnull_47363 {
    private final Productionnull_47363 production = new Productionnull_47363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}