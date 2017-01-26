package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_226 {
    private final Production30_226 production = new Production30_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}