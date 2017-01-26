package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_235 {
    private final Production4_235 production = new Production4_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}