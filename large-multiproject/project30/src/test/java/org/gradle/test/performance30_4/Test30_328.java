package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_328 {
    private final Production30_328 production = new Production30_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}