package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_20 {
    private final Production18_20 production = new Production18_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}