package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_486 {
    private final Production30_486 production = new Production30_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}