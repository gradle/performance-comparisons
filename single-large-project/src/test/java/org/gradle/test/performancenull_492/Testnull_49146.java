package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49146 {
    private final Productionnull_49146 production = new Productionnull_49146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}