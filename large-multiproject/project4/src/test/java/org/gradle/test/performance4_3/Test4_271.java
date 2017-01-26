package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_271 {
    private final Production4_271 production = new Production4_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}