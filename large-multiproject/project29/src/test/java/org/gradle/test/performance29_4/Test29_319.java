package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_319 {
    private final Production29_319 production = new Production29_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}