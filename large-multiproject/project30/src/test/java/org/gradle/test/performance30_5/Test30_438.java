package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_438 {
    private final Production30_438 production = new Production30_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}