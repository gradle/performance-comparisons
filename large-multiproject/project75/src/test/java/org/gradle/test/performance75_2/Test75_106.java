package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_106 {
    private final Production75_106 production = new Production75_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}