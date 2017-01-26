package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_248 {
    private final Production7_248 production = new Production7_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}