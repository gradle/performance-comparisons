package org.gradle.test.performancenull_279;

import static org.junit.Assert.*;

public class Testnull_27869 {
    private final Productionnull_27869 production = new Productionnull_27869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}