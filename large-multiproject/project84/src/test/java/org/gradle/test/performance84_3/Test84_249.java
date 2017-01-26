package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_249 {
    private final Production84_249 production = new Production84_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}