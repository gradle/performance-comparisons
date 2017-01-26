package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_237 {
    private final Production92_237 production = new Production92_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}