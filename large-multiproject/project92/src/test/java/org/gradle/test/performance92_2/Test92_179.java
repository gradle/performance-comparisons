package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_179 {
    private final Production92_179 production = new Production92_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}