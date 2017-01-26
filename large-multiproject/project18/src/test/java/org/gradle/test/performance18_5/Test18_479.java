package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_479 {
    private final Production18_479 production = new Production18_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}