package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_259 {
    private final Production75_259 production = new Production75_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}