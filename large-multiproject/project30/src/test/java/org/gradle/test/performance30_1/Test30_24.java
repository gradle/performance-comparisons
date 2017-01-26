package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_24 {
    private final Production30_24 production = new Production30_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}