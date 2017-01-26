package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_181 {
    private final Production18_181 production = new Production18_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}