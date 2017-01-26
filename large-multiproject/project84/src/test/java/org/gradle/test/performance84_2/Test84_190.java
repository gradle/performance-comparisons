package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_190 {
    private final Production84_190 production = new Production84_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}