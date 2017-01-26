package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_248 {
    private final Production30_248 production = new Production30_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}