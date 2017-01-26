package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49996 {
    private final Productionnull_49996 production = new Productionnull_49996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}