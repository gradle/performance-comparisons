package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_63 {
    private final Production18_63 production = new Production18_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}