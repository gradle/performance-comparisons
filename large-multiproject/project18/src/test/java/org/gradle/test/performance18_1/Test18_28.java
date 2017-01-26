package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_28 {
    private final Production18_28 production = new Production18_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}