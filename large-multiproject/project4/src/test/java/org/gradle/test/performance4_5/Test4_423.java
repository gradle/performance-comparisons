package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_423 {
    private final Production4_423 production = new Production4_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}