package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_135 {
    private final Production84_135 production = new Production84_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}