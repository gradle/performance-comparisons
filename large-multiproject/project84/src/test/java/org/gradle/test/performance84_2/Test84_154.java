package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_154 {
    private final Production84_154 production = new Production84_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}