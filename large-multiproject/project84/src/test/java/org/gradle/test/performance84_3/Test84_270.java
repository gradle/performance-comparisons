package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_270 {
    private final Production84_270 production = new Production84_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}