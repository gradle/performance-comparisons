package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27491 {
    private final Productionnull_27491 production = new Productionnull_27491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}