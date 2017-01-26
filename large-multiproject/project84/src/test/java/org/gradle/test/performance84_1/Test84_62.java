package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_62 {
    private final Production84_62 production = new Production84_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}