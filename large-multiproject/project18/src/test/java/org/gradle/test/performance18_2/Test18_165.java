package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_165 {
    private final Production18_165 production = new Production18_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}