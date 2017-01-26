package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_177 {
    private final Production4_177 production = new Production4_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}