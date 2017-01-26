package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_47 {
    private final Production18_47 production = new Production18_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}