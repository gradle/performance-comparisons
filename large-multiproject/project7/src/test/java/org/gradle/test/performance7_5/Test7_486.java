package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_486 {
    private final Production7_486 production = new Production7_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}