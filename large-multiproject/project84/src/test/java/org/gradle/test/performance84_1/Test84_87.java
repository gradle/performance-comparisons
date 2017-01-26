package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_87 {
    private final Production84_87 production = new Production84_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}