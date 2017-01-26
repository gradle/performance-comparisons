package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_340 {
    private final Production84_340 production = new Production84_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}