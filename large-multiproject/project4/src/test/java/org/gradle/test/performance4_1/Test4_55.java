package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_55 {
    private final Production4_55 production = new Production4_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}