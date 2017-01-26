package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_489 {
    private final Production4_489 production = new Production4_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}