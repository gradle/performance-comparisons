package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_4 {
    private final Production84_4 production = new Production84_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}