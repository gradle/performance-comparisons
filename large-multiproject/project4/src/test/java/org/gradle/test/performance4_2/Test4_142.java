package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_142 {
    private final Production4_142 production = new Production4_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}