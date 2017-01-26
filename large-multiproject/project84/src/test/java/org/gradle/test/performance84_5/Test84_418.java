package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_418 {
    private final Production84_418 production = new Production84_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}