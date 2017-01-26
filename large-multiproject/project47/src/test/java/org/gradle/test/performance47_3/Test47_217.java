package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_217 {
    private final Production47_217 production = new Production47_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}