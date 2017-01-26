package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_319 {
    private final Production1_319 production = new Production1_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}