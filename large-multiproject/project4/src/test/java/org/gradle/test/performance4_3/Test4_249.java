package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_249 {
    private final Production4_249 production = new Production4_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}