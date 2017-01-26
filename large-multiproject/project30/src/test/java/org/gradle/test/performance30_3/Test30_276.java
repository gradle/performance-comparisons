package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_276 {
    private final Production30_276 production = new Production30_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}