package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_349 {
    private final Production18_349 production = new Production18_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}