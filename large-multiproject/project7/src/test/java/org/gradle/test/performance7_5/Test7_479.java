package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_479 {
    private final Production7_479 production = new Production7_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}