package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_8 {
    private final Production18_8 production = new Production18_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}