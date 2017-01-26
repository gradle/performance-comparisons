package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_340 {
    private final Production18_340 production = new Production18_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}