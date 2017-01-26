package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_420 {
    private final Production18_420 production = new Production18_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}