package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_184 {
    private final Production4_184 production = new Production4_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}