package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_19 {
    private final Production84_19 production = new Production84_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}