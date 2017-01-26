package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_402 {
    private final Production18_402 production = new Production18_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}