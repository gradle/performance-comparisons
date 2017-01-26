package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_383 {
    private final Production19_383 production = new Production19_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}