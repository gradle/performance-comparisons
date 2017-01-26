package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_213 {
    private final Production18_213 production = new Production18_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}