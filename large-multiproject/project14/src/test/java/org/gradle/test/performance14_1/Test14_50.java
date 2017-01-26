package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_50 {
    private final Production14_50 production = new Production14_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}