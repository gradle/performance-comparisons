package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_184 {
    private final Production63_184 production = new Production63_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}