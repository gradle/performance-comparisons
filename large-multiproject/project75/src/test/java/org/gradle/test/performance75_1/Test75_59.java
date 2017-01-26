package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_59 {
    private final Production75_59 production = new Production75_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}