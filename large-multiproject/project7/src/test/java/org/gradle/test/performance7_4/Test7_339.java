package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_339 {
    private final Production7_339 production = new Production7_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}