package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_113 {
    private final Production84_113 production = new Production84_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}