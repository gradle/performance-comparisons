package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42885 {
    private final Productionnull_42885 production = new Productionnull_42885("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}