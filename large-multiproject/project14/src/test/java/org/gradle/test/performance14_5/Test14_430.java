package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_430 {
    private final Production14_430 production = new Production14_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}