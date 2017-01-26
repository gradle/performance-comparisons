package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_54 {
    private final Production18_54 production = new Production18_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}