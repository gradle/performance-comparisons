package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_193 {
    private final Production18_193 production = new Production18_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}