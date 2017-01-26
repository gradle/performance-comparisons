package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_473 {
    private final Production18_473 production = new Production18_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}