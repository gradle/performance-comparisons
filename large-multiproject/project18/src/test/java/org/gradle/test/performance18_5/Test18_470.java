package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_470 {
    private final Production18_470 production = new Production18_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}