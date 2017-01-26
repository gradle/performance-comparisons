package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_339 {
    private final Production18_339 production = new Production18_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}