package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_335 {
    private final Production92_335 production = new Production92_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}