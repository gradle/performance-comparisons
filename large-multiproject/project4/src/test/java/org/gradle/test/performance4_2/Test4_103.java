package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_103 {
    private final Production4_103 production = new Production4_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}