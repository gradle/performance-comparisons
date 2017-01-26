package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_462 {
    private final Production4_462 production = new Production4_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}