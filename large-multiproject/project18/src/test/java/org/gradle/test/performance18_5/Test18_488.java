package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_488 {
    private final Production18_488 production = new Production18_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}