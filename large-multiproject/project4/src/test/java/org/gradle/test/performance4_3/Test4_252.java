package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_252 {
    private final Production4_252 production = new Production4_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}