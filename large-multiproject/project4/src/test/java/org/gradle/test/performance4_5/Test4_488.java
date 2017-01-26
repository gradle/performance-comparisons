package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_488 {
    private final Production4_488 production = new Production4_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}