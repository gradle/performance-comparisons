package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_319 {
    private final Production36_319 production = new Production36_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}