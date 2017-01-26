package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_441 {
    private final Production4_441 production = new Production4_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}