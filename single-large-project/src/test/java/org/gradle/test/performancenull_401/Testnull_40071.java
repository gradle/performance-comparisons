package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40071 {
    private final Productionnull_40071 production = new Productionnull_40071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}