package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_190 {
    private final Production4_190 production = new Production4_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}