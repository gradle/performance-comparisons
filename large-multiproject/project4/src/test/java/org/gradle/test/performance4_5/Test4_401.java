package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_401 {
    private final Production4_401 production = new Production4_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}