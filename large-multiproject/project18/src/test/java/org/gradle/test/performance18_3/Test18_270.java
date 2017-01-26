package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_270 {
    private final Production18_270 production = new Production18_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}