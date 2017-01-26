package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_137 {
    private final Production84_137 production = new Production84_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}