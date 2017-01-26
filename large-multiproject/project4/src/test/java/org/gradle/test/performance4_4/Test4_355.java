package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_355 {
    private final Production4_355 production = new Production4_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}