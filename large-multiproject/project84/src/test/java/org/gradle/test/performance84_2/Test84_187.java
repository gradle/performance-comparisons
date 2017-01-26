package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_187 {
    private final Production84_187 production = new Production84_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}