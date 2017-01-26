package org.gradle.test.performancenull_84;

import static org.junit.Assert.*;

public class Testnull_8354 {
    private final Productionnull_8354 production = new Productionnull_8354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}