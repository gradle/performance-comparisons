package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_5 {
    private final Production75_5 production = new Production75_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}