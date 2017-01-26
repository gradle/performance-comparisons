package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_180 {
    private final Production4_180 production = new Production4_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}