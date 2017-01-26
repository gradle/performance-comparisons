package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4975 {
    private final Productionnull_4975 production = new Productionnull_4975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}