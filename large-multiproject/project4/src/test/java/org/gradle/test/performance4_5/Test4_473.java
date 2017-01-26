package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_473 {
    private final Production4_473 production = new Production4_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}