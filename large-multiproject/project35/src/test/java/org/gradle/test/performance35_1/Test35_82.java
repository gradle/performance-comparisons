package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_82 {
    private final Production35_82 production = new Production35_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}