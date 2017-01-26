package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_84 {
    private final Production7_84 production = new Production7_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}