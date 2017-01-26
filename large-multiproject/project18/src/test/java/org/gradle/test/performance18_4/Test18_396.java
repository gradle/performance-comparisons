package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_396 {
    private final Production18_396 production = new Production18_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}