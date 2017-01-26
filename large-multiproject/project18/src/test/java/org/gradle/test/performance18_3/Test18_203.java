package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_203 {
    private final Production18_203 production = new Production18_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}