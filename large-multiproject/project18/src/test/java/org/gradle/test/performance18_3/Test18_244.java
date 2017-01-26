package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_244 {
    private final Production18_244 production = new Production18_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}