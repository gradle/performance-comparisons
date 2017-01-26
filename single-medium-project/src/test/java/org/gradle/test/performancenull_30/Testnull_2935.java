package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2935 {
    private final Productionnull_2935 production = new Productionnull_2935("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}