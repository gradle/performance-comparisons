package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42842 {
    private final Productionnull_42842 production = new Productionnull_42842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}