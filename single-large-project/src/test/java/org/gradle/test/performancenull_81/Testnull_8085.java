package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8085 {
    private final Productionnull_8085 production = new Productionnull_8085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}