package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_24 {
    private final Production18_24 production = new Production18_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}