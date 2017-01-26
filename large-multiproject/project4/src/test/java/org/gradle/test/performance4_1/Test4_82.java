package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_82 {
    private final Production4_82 production = new Production4_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}