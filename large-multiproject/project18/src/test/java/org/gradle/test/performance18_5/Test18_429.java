package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_429 {
    private final Production18_429 production = new Production18_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}