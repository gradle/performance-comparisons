package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8066 {
    private final Productionnull_8066 production = new Productionnull_8066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}