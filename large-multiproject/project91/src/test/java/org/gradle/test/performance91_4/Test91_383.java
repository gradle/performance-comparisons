package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_383 {
    private final Production91_383 production = new Production91_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}