package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_365 {
    private final Production18_365 production = new Production18_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}