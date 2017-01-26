package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_250 {
    private final Production18_250 production = new Production18_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}