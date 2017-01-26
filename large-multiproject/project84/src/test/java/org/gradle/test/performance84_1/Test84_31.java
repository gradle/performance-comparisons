package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_31 {
    private final Production84_31 production = new Production84_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}