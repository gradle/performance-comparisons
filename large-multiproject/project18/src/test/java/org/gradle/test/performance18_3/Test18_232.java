package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_232 {
    private final Production18_232 production = new Production18_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}