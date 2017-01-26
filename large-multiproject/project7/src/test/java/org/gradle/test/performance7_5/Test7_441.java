package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_441 {
    private final Production7_441 production = new Production7_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}