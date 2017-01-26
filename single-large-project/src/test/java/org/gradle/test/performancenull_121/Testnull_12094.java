package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12094 {
    private final Productionnull_12094 production = new Productionnull_12094("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}