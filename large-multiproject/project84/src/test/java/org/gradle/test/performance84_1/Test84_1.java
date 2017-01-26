package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_1 {
    private final Production84_1 production = new Production84_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}