package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_53 {
    private final Production75_53 production = new Production75_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}