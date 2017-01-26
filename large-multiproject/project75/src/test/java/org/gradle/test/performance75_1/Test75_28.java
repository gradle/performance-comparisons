package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_28 {
    private final Production75_28 production = new Production75_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}