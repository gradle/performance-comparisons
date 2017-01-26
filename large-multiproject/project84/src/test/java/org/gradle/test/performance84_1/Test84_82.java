package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_82 {
    private final Production84_82 production = new Production84_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}