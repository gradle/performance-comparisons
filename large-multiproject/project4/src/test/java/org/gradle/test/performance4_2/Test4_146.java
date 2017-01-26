package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_146 {
    private final Production4_146 production = new Production4_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}