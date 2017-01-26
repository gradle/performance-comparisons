package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20324 {
    private final Productionnull_20324 production = new Productionnull_20324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}