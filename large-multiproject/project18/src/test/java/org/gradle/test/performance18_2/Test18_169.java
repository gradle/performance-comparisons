package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_169 {
    private final Production18_169 production = new Production18_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}