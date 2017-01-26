package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_248 {
    private final Production20_248 production = new Production20_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}