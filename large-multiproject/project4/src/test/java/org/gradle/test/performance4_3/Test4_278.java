package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_278 {
    private final Production4_278 production = new Production4_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}