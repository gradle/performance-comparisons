package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_400 {
    private final Production18_400 production = new Production18_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}