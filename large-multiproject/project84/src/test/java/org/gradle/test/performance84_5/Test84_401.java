package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_401 {
    private final Production84_401 production = new Production84_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}