package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_349 {
    private final Production92_349 production = new Production92_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}