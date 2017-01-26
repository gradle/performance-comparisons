package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_260 {
    private final Production84_260 production = new Production84_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}