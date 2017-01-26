package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27486 {
    private final Productionnull_27486 production = new Productionnull_27486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}