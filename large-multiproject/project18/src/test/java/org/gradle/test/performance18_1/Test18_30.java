package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_30 {
    private final Production18_30 production = new Production18_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}