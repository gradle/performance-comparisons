package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_306 {
    private final Production89_306 production = new Production89_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}