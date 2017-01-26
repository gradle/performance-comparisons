package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_150 {
    private final Production18_150 production = new Production18_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}