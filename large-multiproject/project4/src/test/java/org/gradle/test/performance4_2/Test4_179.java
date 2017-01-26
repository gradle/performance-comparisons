package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_179 {
    private final Production4_179 production = new Production4_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}