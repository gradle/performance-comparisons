package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_405 {
    private final Production75_405 production = new Production75_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}