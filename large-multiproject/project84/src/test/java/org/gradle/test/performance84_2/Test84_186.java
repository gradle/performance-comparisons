package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_186 {
    private final Production84_186 production = new Production84_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}