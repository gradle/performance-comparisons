package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_113 {
    private final Production18_113 production = new Production18_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}