package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_280 {
    private final Production30_280 production = new Production30_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}