package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_57 {
    private final Production18_57 production = new Production18_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}