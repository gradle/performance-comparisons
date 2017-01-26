package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_268 {
    private final Production75_268 production = new Production75_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}