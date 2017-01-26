package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_158 {
    private final Production18_158 production = new Production18_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}