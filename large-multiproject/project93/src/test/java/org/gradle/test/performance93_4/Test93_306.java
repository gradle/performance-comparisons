package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_306 {
    private final Production93_306 production = new Production93_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}