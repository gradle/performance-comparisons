package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21962 {
    private final Productionnull_21962 production = new Productionnull_21962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}