package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_243 {
    private final Production75_243 production = new Production75_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}