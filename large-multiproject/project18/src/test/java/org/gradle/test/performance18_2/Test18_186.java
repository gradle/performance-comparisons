package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_186 {
    private final Production18_186 production = new Production18_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}