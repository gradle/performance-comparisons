package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_107 {
    private final Production84_107 production = new Production84_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}