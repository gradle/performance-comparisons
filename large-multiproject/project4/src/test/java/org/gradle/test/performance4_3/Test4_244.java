package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_244 {
    private final Production4_244 production = new Production4_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}