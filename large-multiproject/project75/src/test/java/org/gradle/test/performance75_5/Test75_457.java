package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_457 {
    private final Production75_457 production = new Production75_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}