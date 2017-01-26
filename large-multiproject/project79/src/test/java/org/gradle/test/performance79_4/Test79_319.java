package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_319 {
    private final Production79_319 production = new Production79_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}