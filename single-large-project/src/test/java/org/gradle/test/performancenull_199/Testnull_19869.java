package org.gradle.test.performancenull_199;

import static org.junit.Assert.*;

public class Testnull_19869 {
    private final Productionnull_19869 production = new Productionnull_19869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}