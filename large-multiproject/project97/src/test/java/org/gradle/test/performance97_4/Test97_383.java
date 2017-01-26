package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_383 {
    private final Production97_383 production = new Production97_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}