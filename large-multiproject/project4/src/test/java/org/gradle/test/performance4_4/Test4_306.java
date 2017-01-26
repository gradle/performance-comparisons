package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_306 {
    private final Production4_306 production = new Production4_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}