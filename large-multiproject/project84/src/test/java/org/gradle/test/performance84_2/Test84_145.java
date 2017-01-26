package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_145 {
    private final Production84_145 production = new Production84_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}