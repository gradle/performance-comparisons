package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_70 {
    private final Production84_70 production = new Production84_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}