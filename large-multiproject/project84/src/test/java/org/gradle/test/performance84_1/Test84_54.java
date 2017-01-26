package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_54 {
    private final Production84_54 production = new Production84_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}