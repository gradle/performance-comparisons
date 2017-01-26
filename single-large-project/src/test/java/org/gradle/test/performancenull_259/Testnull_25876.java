package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25876 {
    private final Productionnull_25876 production = new Productionnull_25876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}