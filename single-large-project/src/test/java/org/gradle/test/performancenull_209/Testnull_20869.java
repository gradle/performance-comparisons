package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20869 {
    private final Productionnull_20869 production = new Productionnull_20869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}