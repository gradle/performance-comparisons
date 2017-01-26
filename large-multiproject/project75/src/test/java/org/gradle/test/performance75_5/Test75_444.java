package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_444 {
    private final Production75_444 production = new Production75_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}