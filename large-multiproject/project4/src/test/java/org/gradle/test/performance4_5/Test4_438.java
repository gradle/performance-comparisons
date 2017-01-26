package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_438 {
    private final Production4_438 production = new Production4_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}