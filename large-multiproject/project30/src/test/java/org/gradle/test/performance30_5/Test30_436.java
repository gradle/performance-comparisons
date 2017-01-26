package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_436 {
    private final Production30_436 production = new Production30_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}