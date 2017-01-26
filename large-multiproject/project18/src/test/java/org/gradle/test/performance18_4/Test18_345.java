package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_345 {
    private final Production18_345 production = new Production18_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}