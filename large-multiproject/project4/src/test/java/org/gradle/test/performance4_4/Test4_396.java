package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_396 {
    private final Production4_396 production = new Production4_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}