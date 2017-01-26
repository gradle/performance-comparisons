package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37869 {
    private final Productionnull_37869 production = new Productionnull_37869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}