package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_213 {
    private final Production84_213 production = new Production84_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}