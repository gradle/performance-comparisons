package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_204 {
    private final Production84_204 production = new Production84_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}