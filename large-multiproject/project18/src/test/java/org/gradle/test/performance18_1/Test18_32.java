package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_32 {
    private final Production18_32 production = new Production18_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}