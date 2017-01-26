package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_37 {
    private final Production84_37 production = new Production84_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}