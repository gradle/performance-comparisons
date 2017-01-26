package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_132 {
    private final Production92_132 production = new Production92_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}