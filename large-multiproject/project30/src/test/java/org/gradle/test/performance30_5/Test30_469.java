package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_469 {
    private final Production30_469 production = new Production30_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}