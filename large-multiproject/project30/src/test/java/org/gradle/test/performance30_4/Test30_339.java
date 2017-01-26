package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_339 {
    private final Production30_339 production = new Production30_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}