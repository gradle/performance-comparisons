package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_310 {
    private final Production75_310 production = new Production75_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}