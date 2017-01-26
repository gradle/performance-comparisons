package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_252 {
    private final Production92_252 production = new Production92_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}