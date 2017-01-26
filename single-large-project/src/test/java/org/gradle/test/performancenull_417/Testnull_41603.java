package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41603 {
    private final Productionnull_41603 production = new Productionnull_41603("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}