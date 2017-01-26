package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_181 {
    private final Production84_181 production = new Production84_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}