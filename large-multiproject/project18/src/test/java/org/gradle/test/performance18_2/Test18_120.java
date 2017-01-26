package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_120 {
    private final Production18_120 production = new Production18_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}