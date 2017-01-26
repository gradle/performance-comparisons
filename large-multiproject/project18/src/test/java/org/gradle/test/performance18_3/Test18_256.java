package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_256 {
    private final Production18_256 production = new Production18_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}