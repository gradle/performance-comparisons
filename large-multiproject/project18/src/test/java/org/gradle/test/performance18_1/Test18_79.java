package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_79 {
    private final Production18_79 production = new Production18_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}