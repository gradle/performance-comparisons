package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_217 {
    private final Production4_217 production = new Production4_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}