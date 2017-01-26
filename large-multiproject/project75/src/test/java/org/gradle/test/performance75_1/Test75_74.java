package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_74 {
    private final Production75_74 production = new Production75_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}