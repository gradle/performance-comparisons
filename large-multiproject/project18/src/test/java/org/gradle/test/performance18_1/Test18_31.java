package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_31 {
    private final Production18_31 production = new Production18_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}