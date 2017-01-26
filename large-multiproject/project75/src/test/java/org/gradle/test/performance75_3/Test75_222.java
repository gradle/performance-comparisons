package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_222 {
    private final Production75_222 production = new Production75_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}