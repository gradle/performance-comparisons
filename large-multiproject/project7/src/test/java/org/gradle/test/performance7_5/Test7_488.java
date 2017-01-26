package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_488 {
    private final Production7_488 production = new Production7_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}