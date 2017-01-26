package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_276 {
    private final Production18_276 production = new Production18_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}