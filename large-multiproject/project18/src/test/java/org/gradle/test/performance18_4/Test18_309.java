package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_309 {
    private final Production18_309 production = new Production18_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}