package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_64 {
    private final Production18_64 production = new Production18_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}