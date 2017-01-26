package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_84 {
    private final Production18_84 production = new Production18_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}