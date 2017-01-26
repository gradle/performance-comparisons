package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_121 {
    private final Production18_121 production = new Production18_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}