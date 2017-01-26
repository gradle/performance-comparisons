package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2975 {
    private final Productionnull_2975 production = new Productionnull_2975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}