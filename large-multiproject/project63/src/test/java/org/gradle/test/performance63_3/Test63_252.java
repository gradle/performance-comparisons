package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_252 {
    private final Production63_252 production = new Production63_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}