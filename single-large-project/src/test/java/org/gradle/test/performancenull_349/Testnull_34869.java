package org.gradle.test.performancenull_349;

import static org.junit.Assert.*;

public class Testnull_34869 {
    private final Productionnull_34869 production = new Productionnull_34869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}