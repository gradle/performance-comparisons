package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_84 {
    private final Production84_84 production = new Production84_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}