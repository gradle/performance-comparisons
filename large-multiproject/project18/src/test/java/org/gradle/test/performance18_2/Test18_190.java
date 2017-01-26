package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_190 {
    private final Production18_190 production = new Production18_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}