package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_253 {
    private final Production75_253 production = new Production75_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}