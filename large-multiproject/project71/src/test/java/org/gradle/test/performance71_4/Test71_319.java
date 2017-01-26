package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_319 {
    private final Production71_319 production = new Production71_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}