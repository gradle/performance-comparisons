package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_232 {
    private final Production92_232 production = new Production92_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}