package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_297 {
    private final Production75_297 production = new Production75_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}