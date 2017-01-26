package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6186 {
    private final Productionnull_6186 production = new Productionnull_6186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}