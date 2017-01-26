package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_479 {
    private final Production92_479 production = new Production92_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}