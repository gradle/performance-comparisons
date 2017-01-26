package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4745 {
    private final Productionnull_4745 production = new Productionnull_4745("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}