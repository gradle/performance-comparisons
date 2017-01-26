package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_370 {
    private final Production18_370 production = new Production18_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}