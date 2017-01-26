package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_479 {
    private final Production30_479 production = new Production30_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}