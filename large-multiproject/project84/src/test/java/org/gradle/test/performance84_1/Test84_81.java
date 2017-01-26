package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_81 {
    private final Production84_81 production = new Production84_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}