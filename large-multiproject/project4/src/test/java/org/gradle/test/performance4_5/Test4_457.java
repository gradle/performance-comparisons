package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_457 {
    private final Production4_457 production = new Production4_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}