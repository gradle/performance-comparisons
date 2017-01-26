package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_345 {
    private final Production7_345 production = new Production7_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}