package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_216 {
    private final Production18_216 production = new Production18_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}