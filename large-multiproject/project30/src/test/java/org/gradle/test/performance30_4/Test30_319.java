package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_319 {
    private final Production30_319 production = new Production30_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}