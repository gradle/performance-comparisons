package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_343 {
    private final Production4_343 production = new Production4_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}