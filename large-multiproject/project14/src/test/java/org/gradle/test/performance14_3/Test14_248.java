package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_248 {
    private final Production14_248 production = new Production14_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}