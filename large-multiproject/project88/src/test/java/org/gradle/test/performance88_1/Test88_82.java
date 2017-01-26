package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_82 {
    private final Production88_82 production = new Production88_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}