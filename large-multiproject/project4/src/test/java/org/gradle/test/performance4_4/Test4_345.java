package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_345 {
    private final Production4_345 production = new Production4_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}