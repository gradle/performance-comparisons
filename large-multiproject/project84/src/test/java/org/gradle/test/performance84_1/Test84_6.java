package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_6 {
    private final Production84_6 production = new Production84_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}