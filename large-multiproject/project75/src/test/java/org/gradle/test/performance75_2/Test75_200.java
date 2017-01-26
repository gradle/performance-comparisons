package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_200 {
    private final Production75_200 production = new Production75_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}