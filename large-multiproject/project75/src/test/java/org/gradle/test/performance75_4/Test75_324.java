package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_324 {
    private final Production75_324 production = new Production75_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}