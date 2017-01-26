package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_383 {
    private final Production64_383 production = new Production64_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}