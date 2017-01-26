package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_321 {
    private final Production4_321 production = new Production4_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}