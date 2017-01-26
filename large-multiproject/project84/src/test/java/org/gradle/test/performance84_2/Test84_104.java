package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_104 {
    private final Production84_104 production = new Production84_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}