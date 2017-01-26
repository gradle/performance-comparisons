package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_459 {
    private final Production30_459 production = new Production30_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}