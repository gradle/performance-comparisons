package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12049 {
    private final Productionnull_12049 production = new Productionnull_12049("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}