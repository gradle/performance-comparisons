package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_322 {
    private final Production84_322 production = new Production84_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}