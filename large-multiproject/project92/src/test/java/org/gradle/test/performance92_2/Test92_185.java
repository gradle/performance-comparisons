package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_185 {
    private final Production92_185 production = new Production92_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}