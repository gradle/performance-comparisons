package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_60 {
    private final Production75_60 production = new Production75_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}