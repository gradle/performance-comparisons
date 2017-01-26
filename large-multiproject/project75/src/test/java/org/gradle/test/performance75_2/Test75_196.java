package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_196 {
    private final Production75_196 production = new Production75_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}