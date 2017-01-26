package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_433 {
    private final Production14_433 production = new Production14_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}