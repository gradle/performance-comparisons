package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_55 {
    private final Production84_55 production = new Production84_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}