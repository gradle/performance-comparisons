package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_455 {
    private final Production7_455 production = new Production7_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}