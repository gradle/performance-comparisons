package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3869 {
    private final Productionnull_3869 production = new Productionnull_3869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}