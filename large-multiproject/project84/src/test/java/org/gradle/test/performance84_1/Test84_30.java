package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_30 {
    private final Production84_30 production = new Production84_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}