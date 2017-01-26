package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27475 {
    private final Productionnull_27475 production = new Productionnull_27475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}