package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_82 {
    private final Production25_82 production = new Production25_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}