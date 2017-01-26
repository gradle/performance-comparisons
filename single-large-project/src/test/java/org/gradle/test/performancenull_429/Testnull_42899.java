package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42899 {
    private final Productionnull_42899 production = new Productionnull_42899("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}