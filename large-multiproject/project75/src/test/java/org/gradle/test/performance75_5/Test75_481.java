package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_481 {
    private final Production75_481 production = new Production75_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}