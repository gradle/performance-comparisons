package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_383 {
    private final Production51_383 production = new Production51_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}