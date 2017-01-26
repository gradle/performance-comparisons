package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42893 {
    private final Productionnull_42893 production = new Productionnull_42893("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}