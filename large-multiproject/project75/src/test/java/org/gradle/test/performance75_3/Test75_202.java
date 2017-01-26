package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_202 {
    private final Production75_202 production = new Production75_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}