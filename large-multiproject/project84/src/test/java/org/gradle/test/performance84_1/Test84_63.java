package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_63 {
    private final Production84_63 production = new Production84_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}