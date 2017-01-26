package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_82 {
    private final Production92_82 production = new Production92_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}