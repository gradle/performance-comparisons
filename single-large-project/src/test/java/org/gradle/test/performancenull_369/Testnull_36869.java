package org.gradle.test.performancenull_369;

import static org.junit.Assert.*;

public class Testnull_36869 {
    private final Productionnull_36869 production = new Productionnull_36869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}