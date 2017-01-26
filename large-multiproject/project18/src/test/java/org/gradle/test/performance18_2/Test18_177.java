package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_177 {
    private final Production18_177 production = new Production18_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}