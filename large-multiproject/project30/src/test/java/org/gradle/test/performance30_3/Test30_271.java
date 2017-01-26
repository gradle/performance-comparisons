package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_271 {
    private final Production30_271 production = new Production30_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}