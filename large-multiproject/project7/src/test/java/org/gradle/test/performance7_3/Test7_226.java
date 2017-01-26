package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_226 {
    private final Production7_226 production = new Production7_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}