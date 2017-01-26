package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_409 {
    private final Production30_409 production = new Production30_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}