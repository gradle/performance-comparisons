package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_343 {
    private final Production18_343 production = new Production18_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}