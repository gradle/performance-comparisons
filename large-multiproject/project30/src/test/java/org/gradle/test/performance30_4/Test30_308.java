package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_308 {
    private final Production30_308 production = new Production30_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}