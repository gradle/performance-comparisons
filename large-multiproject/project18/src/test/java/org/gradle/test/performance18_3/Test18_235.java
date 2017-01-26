package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_235 {
    private final Production18_235 production = new Production18_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}