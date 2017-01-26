package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_248 {
    private final Production63_248 production = new Production63_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}