package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_252 {
    private final Production89_252 production = new Production89_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}