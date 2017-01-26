package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_116 {
    private final Production4_116 production = new Production4_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}