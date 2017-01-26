package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_82 {
    private final Production58_82 production = new Production58_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}