package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4773 {
    private final Productionnull_4773 production = new Productionnull_4773("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}