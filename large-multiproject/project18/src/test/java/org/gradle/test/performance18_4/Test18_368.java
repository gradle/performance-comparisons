package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_368 {
    private final Production18_368 production = new Production18_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}