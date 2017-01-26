package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20146 {
    private final Productionnull_20146 production = new Productionnull_20146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}