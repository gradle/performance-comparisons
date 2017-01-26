package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_16 {
    private final Production84_16 production = new Production84_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}