package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_324 {
    private final Production84_324 production = new Production84_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}