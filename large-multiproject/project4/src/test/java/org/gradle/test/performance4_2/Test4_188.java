package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_188 {
    private final Production4_188 production = new Production4_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}