package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_179 {
    private final Production7_179 production = new Production7_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}