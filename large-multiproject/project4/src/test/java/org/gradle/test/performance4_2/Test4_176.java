package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_176 {
    private final Production4_176 production = new Production4_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}