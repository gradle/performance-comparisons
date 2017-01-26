package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49994 {
    private final Productionnull_49994 production = new Productionnull_49994("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}