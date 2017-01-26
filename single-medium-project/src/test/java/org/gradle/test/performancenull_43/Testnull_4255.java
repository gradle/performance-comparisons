package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4255 {
    private final Productionnull_4255 production = new Productionnull_4255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}