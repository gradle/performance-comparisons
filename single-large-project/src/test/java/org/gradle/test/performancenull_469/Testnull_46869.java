package org.gradle.test.performancenull_469;

import static org.junit.Assert.*;

public class Testnull_46869 {
    private final Productionnull_46869 production = new Productionnull_46869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}