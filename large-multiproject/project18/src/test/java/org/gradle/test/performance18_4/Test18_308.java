package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_308 {
    private final Production18_308 production = new Production18_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}