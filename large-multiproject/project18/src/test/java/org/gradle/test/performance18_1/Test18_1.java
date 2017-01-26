package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_1 {
    private final Production18_1 production = new Production18_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}