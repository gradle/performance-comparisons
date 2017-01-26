package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_90 {
    private final Production84_90 production = new Production84_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}