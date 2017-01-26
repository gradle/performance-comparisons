package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_65 {
    private final Production84_65 production = new Production84_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}