package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_327 {
    private final Production14_327 production = new Production14_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}