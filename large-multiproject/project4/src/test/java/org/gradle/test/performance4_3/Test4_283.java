package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_283 {
    private final Production4_283 production = new Production4_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}