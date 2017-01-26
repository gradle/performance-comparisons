package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_371 {
    private final Production18_371 production = new Production18_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}