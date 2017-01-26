package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_176 {
    private final Production18_176 production = new Production18_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}