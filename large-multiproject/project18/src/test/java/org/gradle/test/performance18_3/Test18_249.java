package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_249 {
    private final Production18_249 production = new Production18_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}