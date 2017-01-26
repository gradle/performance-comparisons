package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_436 {
    private final Production7_436 production = new Production7_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}