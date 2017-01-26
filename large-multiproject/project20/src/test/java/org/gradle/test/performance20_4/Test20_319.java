package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_319 {
    private final Production20_319 production = new Production20_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}