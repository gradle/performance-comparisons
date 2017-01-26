package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_131 {
    private final Production18_131 production = new Production18_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}