package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27445 {
    private final Productionnull_27445 production = new Productionnull_27445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}