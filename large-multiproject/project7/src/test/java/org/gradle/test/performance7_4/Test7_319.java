package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_319 {
    private final Production7_319 production = new Production7_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}