package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_319 {
    private final Production14_319 production = new Production14_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}