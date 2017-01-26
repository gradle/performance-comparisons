package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_470 {
    private final Production30_470 production = new Production30_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}