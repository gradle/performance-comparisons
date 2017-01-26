package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_321 {
    private final Production18_321 production = new Production18_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}