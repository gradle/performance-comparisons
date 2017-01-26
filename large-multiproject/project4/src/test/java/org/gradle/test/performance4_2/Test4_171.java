package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_171 {
    private final Production4_171 production = new Production4_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}