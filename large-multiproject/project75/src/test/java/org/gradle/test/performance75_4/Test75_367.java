package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_367 {
    private final Production75_367 production = new Production75_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}