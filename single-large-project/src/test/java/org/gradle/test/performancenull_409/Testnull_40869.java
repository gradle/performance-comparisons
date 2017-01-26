package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40869 {
    private final Productionnull_40869 production = new Productionnull_40869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}