package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_421 {
    private final Production18_421 production = new Production18_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}