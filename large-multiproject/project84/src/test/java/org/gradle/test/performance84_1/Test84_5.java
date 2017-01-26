package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_5 {
    private final Production84_5 production = new Production84_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}