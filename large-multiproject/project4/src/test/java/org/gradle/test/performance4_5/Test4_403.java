package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_403 {
    private final Production4_403 production = new Production4_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}