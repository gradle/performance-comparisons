package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_185 {
    private final Production63_185 production = new Production63_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}