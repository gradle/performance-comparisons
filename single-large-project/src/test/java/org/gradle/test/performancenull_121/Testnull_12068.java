package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12068 {
    private final Productionnull_12068 production = new Productionnull_12068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}