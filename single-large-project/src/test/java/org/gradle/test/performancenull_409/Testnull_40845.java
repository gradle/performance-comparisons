package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40845 {
    private final Productionnull_40845 production = new Productionnull_40845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}