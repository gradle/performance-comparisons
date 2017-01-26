package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_197 {
    private final Production63_197 production = new Production63_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}