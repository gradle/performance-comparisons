package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_188 {
    private final Production75_188 production = new Production75_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}