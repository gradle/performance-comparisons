package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_8 {
    private final Production75_8 production = new Production75_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}