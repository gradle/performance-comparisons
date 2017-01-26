package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_474 {
    private final Production75_474 production = new Production75_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}