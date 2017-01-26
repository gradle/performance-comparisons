package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_319 {
    private final Production43_319 production = new Production43_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}