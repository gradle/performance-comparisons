package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_455 {
    private final Production84_455 production = new Production84_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}