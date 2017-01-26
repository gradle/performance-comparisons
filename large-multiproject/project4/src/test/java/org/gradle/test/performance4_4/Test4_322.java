package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_322 {
    private final Production4_322 production = new Production4_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}