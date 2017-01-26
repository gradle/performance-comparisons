package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_319 {
    private final Production5_319 production = new Production5_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}