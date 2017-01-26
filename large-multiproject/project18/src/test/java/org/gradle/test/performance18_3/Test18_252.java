package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_252 {
    private final Production18_252 production = new Production18_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}