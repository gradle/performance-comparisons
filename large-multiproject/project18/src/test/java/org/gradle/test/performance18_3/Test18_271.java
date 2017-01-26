package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_271 {
    private final Production18_271 production = new Production18_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}