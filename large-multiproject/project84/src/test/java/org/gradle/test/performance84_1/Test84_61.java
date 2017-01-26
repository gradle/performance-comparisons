package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_61 {
    private final Production84_61 production = new Production84_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}