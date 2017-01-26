package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21937 {
    private final Productionnull_21937 production = new Productionnull_21937("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}