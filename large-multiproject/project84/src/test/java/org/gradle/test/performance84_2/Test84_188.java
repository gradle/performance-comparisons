package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_188 {
    private final Production84_188 production = new Production84_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}