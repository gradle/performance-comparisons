package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_32 {
    private final Production4_32 production = new Production4_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}