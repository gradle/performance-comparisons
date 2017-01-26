package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_138 {
    private final Production84_138 production = new Production84_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}