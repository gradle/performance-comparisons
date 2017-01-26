package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_440 {
    private final Production18_440 production = new Production18_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}