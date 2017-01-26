package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_19 {
    private final Production18_19 production = new Production18_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}