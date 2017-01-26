package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_82 {
    private final Production48_82 production = new Production48_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}