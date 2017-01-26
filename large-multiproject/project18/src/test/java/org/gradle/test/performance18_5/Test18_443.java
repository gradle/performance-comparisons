package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_443 {
    private final Production18_443 production = new Production18_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}