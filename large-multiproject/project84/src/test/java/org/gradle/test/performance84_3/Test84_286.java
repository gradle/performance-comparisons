package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_286 {
    private final Production84_286 production = new Production84_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}