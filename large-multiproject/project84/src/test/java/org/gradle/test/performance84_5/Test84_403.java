package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_403 {
    private final Production84_403 production = new Production84_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}