package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_248 {
    private final Production92_248 production = new Production92_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}