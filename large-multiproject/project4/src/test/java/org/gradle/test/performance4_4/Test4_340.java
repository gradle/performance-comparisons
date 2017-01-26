package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_340 {
    private final Production4_340 production = new Production4_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}