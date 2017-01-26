package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_303 {
    private final Production75_303 production = new Production75_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}