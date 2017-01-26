package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_114 {
    private final Production84_114 production = new Production84_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}