package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_486 {
    private final Production4_486 production = new Production4_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}