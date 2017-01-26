package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_246 {
    private final Production75_246 production = new Production75_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}