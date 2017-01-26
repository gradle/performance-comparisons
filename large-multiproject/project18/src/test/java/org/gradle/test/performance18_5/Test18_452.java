package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_452 {
    private final Production18_452 production = new Production18_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}