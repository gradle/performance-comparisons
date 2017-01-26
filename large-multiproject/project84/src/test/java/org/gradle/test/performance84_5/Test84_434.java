package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_434 {
    private final Production84_434 production = new Production84_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}