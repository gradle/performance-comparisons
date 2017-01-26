package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_466 {
    private final Production75_466 production = new Production75_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}