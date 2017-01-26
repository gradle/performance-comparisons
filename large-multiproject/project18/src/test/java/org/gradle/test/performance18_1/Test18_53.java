package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_53 {
    private final Production18_53 production = new Production18_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}