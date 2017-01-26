package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_452 {
    private final Production4_452 production = new Production4_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}