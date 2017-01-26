package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_319 {
    private final Production10_319 production = new Production10_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}