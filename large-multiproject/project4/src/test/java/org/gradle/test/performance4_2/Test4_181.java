package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_181 {
    private final Production4_181 production = new Production4_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}