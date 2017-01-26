package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_203 {
    private final Production4_203 production = new Production4_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}