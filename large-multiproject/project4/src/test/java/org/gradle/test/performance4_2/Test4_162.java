package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_162 {
    private final Production4_162 production = new Production4_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}