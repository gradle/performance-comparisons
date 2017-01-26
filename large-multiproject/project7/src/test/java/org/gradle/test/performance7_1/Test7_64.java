package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_64 {
    private final Production7_64 production = new Production7_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}