package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_6 {
    private final Production18_6 production = new Production18_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}