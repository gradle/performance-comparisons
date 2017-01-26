package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_217 {
    private final Production92_217 production = new Production92_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}