package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_69 {
    private final Production18_69 production = new Production18_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}