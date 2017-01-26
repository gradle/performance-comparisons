package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_364 {
    private final Production75_364 production = new Production75_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}