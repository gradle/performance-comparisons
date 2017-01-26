package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_217 {
    private final Production18_217 production = new Production18_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}