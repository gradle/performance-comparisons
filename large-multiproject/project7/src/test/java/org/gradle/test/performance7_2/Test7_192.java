package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_192 {
    private final Production7_192 production = new Production7_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}