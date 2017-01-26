package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40879 {
    private final Productionnull_40879 production = new Productionnull_40879("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}