package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49923 {
    private final Productionnull_49923 production = new Productionnull_49923("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}