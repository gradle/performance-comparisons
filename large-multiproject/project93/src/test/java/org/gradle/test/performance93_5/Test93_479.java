package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_479 {
    private final Production93_479 production = new Production93_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}