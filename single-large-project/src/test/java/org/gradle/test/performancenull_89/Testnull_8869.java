package org.gradle.test.performancenull_89;

import static org.junit.Assert.*;

public class Testnull_8869 {
    private final Productionnull_8869 production = new Productionnull_8869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}