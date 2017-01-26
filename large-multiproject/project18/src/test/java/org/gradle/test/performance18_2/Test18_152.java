package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_152 {
    private final Production18_152 production = new Production18_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}