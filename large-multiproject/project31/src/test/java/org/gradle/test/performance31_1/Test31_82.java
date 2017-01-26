package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_82 {
    private final Production31_82 production = new Production31_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}