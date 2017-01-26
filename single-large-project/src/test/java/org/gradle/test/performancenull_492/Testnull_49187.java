package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49187 {
    private final Productionnull_49187 production = new Productionnull_49187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}