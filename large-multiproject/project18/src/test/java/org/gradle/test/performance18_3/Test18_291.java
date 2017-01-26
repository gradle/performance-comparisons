package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_291 {
    private final Production18_291 production = new Production18_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}