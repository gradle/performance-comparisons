package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_95 {
    private final Production84_95 production = new Production84_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}