package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_363 {
    private final Production18_363 production = new Production18_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}