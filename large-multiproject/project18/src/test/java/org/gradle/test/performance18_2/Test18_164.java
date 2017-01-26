package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_164 {
    private final Production18_164 production = new Production18_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}