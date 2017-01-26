package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_64 {
    private final Production4_64 production = new Production4_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}