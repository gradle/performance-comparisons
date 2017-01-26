package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_222 {
    private final Production84_222 production = new Production84_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}