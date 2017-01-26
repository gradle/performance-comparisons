package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_168 {
    private final Production84_168 production = new Production84_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}