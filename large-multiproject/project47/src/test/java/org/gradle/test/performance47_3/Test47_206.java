package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_206 {
    private final Production47_206 production = new Production47_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}