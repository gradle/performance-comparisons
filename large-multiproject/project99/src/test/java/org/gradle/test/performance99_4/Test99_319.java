package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_319 {
    private final Production99_319 production = new Production99_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}