package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_332 {
    private final Production92_332 production = new Production92_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}