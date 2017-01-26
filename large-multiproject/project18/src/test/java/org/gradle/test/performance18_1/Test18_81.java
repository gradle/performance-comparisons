package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_81 {
    private final Production18_81 production = new Production18_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}