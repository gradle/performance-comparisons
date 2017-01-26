package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_405 {
    private final Production84_405 production = new Production84_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}