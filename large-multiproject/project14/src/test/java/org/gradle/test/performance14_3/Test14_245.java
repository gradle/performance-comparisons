package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_245 {
    private final Production14_245 production = new Production14_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}