package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_70 {
    private final Production18_70 production = new Production18_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}