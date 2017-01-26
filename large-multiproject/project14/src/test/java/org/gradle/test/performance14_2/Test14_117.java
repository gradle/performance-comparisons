package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_117 {
    private final Production14_117 production = new Production14_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}