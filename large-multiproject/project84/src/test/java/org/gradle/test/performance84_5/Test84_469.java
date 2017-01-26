package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_469 {
    private final Production84_469 production = new Production84_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}