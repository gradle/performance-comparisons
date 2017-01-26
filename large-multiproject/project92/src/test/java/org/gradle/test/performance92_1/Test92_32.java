package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_32 {
    private final Production92_32 production = new Production92_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}