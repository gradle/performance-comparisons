package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_306 {
    private final Production92_306 production = new Production92_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}