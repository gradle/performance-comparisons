package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_82 {
    private final Production75_82 production = new Production75_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}