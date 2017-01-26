package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41186 {
    private final Productionnull_41186 production = new Productionnull_41186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}