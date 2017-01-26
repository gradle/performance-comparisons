package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27418 {
    private final Productionnull_27418 production = new Productionnull_27418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}