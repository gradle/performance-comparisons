package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_206 {
    private final Production4_206 production = new Production4_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}