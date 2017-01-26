package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_319 {
    private final Production63_319 production = new Production63_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}