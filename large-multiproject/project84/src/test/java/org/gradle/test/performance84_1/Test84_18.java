package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_18 {
    private final Production84_18 production = new Production84_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}