package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40126 {
    private final Productionnull_40126 production = new Productionnull_40126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}