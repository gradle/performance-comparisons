package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_170 {
    private final Production18_170 production = new Production18_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}