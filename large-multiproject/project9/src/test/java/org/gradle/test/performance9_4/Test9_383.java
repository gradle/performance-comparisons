package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_383 {
    private final Production9_383 production = new Production9_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}