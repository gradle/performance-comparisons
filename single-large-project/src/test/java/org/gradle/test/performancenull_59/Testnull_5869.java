package org.gradle.test.performancenull_59;

import static org.junit.Assert.*;

public class Testnull_5869 {
    private final Productionnull_5869 production = new Productionnull_5869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}