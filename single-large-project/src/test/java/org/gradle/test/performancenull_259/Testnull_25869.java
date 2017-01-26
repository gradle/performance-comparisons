package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25869 {
    private final Productionnull_25869 production = new Productionnull_25869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}