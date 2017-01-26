package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_398 {
    private final Production18_398 production = new Production18_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}