package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_191 {
    private final Production84_191 production = new Production84_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}