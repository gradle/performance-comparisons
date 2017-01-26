package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_480 {
    private final Production18_480 production = new Production18_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}