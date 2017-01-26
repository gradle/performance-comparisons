package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_37 {
    private final Production18_37 production = new Production18_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}