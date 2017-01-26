package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42890 {
    private final Productionnull_42890 production = new Productionnull_42890("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}