package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_319 {
    private final Production2_319 production = new Production2_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}