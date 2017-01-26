package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_254 {
    private final Production7_254 production = new Production7_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}