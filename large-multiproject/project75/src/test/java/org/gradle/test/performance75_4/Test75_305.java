package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_305 {
    private final Production75_305 production = new Production75_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}