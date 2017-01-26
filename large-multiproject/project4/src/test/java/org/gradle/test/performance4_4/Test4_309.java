package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_309 {
    private final Production4_309 production = new Production4_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}