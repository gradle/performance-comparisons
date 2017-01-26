package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_248 {
    private final Production5_248 production = new Production5_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}