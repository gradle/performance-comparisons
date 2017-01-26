package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_395 {
    private final Production84_395 production = new Production84_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}