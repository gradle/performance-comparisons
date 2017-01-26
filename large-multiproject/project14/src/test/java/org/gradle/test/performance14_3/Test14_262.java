package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_262 {
    private final Production14_262 production = new Production14_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}