package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_306 {
    private final Production18_306 production = new Production18_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}