package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_156 {
    private final Production84_156 production = new Production84_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}