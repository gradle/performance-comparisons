package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_126 {
    private final Production84_126 production = new Production84_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}