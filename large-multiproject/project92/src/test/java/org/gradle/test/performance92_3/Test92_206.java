package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_206 {
    private final Production92_206 production = new Production92_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}