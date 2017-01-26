package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_287 {
    private final Production7_287 production = new Production7_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}