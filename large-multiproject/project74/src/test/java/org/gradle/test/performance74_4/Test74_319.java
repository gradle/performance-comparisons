package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_319 {
    private final Production74_319 production = new Production74_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}