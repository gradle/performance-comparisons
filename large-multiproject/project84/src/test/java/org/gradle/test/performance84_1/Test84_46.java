package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_46 {
    private final Production84_46 production = new Production84_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}