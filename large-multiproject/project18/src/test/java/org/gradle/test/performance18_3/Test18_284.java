package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_284 {
    private final Production18_284 production = new Production18_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}