package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_311 {
    private final Production18_311 production = new Production18_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}