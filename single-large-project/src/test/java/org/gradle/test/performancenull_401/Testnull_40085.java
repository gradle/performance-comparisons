package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40085 {
    private final Productionnull_40085 production = new Productionnull_40085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}